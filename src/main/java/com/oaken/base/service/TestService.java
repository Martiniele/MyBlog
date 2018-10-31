package com.oaken.base.service;

import com.alibaba.fastjson.JSON;
import com.oaken.base.entity.model.Province;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@CacheConfig(cacheNames = "test1")
@Service
public class TestService {

    @Cacheable(cacheNames = {"test1"})
    public boolean PrintSth(List<Province> provinceList) {
//        String json = "[{\"name\":\"china\",\"province\":\"guangxi\",\"city\":[{\"name\":\"nanning\"},{\"name\":\"hechi\"}]},{\"name\":\"china\",\"province\":\"guangdong\",\"city\":[{\"name\":\"guangdzhou\"},{\"name\":\"shenzhen\"}]},{\"name\":\"china\",\"province\":\"hu'nan\",\"city\":[{\"name\":\"changsha\"},{\"name\":\"yongzhou\"}]}]";
        //language=JSON
        String json2 = "[{\"country\":\"english\",\"province\":[{\"name\":\"lundun\",\"city\":[{\"name\":\"xxx\"},{\"name\":\"xxxxc\"}]}]},{\"country\":\"china\",\"province\":[{\"name\":\"hu'nan\",\"city\":[{\"name\":\"changsha\"},{\"name\":\"yongzhou\"}]}]},{\"country\":\"china\",\"province\":[{\"name\":\"hu'nan\",\"city\":[{\"name\":\"changsha\"},{\"name\":\"yongzhou\"}]}]}]";
        provinceList.addAll(JSON.parseArray(json2, Province.class));
        return true;
    }
}
