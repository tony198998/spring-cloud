package com.wode.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 以myspcloud开头的配置被匹配到
 * @author Evan
 */
@Component
@ConfigurationProperties(prefix="myspcloud")
@Data
public class OrderProperties {
    private ItemProperties item = new ItemProperties();
}
