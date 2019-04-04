package com.angular.be.angularbe.core.impl;

import com.angular.be.angularbe.core.BaseEndPoint;
import com.angular.be.angularbe.data.dto.JsonWrapper;
import org.assertj.core.util.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

public  abstract class BaseEndPointImpl<T,ID> implements BaseEndPoint<T,ID> {
    @Autowired
    CrudRepository<T,ID> baseRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseEndPointImpl.class);

    Class<T> persistentClass;
    String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public BaseEndPointImpl() {
        this.persistentClass = (Class<T>)
                ((ParameterizedType)getClass().getGenericSuperclass())
                        .getActualTypeArguments()[0];
        this.path=this.persistentClass.getSimpleName().toLowerCase();
    }


    @Override
    @PostMapping("/save")
    public ResponseEntity save(@RequestBody T t){
        baseRepository.save(t);
        return  ResponseEntity.ok(new JsonWrapper(null,0,"save",HttpStatus.OK));

    }

    @Override
    @GetMapping("/findAll")
    public ResponseEntity findAll() {
        List<T> result = Lists.newArrayList(baseRepository.findAll());
        int size = result.size();
        return ResponseEntity.ok(new JsonWrapper(result,result.size(),"readAll data "+this.path,HttpStatus.OK));
    }

    @Override
    @GetMapping("/findById/{id}")
    public ResponseEntity findById(@PathVariable("id") ID id) {
        T t = baseRepository.findById(id).orElse(null);
        List<T> ts = new ArrayList<>();
        if(t!=null){
            ts.add(t);
        }else{
            LOGGER.error("Can't find Id {} ",id);
            return ResponseEntity.ok(new JsonWrapper(ts,ts.size(),"Read By Id", HttpStatus.NOT_FOUND));
        }
        return ResponseEntity.ok(new JsonWrapper(ts,ts.size(),"Read By Id", HttpStatus.OK));
    }



    @Override
    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") ID id){
        T t = baseRepository.findById(id).get();
        baseRepository.delete(t);
        return ResponseEntity.ok(new JsonWrapper(null,0,"delete",HttpStatus.OK));
    }
}
