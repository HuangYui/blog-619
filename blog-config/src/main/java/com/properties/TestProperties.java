package com.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author : HY
 * @version : V1.0
 * @ClassName : TestProperties
 * @Description:
 * @date : 2021/9/9 14:16
 */
@RefreshScope
@Data
@ConfigurationProperties(prefix = "test")
@Component
public class TestProperties {

    private String useLocalCache;

}
