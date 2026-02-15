package net.engineeringdigest.journalApp.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import net.engineeringdigest.journalApp.api.response.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class RedisService {
//    @Autowired
//    private RedisTemplate redisTemplate;
    @Autowired
    private RedisTemplate<String, String> redisTemplate;
    private final ObjectMapper mapper = new ObjectMapper();

    public <T> T get(String key, Class<T> entityClass){
//       try{
//           Object o = redisTemplate.opsForValue().get(key);
//           ObjectMapper Mapper = new ObjectMapper();
//           return Mapper.readValue(o.toString(),entityClass);
        try {
            String json = redisTemplate.opsForValue().get(key);

            if (json == null) {
                return null;
            }

            return mapper.readValue(json, entityClass);

        }catch (Exception e){
        log.error("Exception ",e);
        return null;
       }
    }
    public void set(String key,Object o,Long ttl){
        try{
            String json = mapper.writeValueAsString(o);
            redisTemplate.opsForValue().set(key,json,ttl, TimeUnit.SECONDS);


        }catch (Exception e){
            log.error("Exception ",e);
        }
    }
}
