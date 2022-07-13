package com.jx.packge;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.PrimitiveIterator;

/**
 * @ClassName TtlConfig
 * @Description TODO
 * @Author
 * @Date 2022/7/13 16:48
 */

@Configuration
@Data
@ConfigurationProperties(prefix = "ttl")
@ToString
public class TtlConfig {

    private  Integer maxTime;
    private  Integer minTime;
}
