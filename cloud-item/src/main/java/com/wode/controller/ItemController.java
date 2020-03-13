package com.wode.controller;

import com.wode.config.JdbcConfigBean;
import com.wode.entity.Item;
import com.wode.service.ItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/item")
@Slf4j
@Api("SwaggerDemo控制器")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @Autowired
    private JdbcConfigBean jdbcConfigBean;
    /**
     * 对外提供接口服务，查询商品信息
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}")
    public Item queryItemById(@PathVariable("id") Long id) {
        log.info("----------"+id);
        return this.itemService.queryItemById(id);
    }

    @GetMapping(value = "/testconfig")
    public String testconfig(){
        return this.jdbcConfigBean.toString();
    }


    @ApiOperation("Swagger演示")
    @GetMapping("/swaggerIndex")
    public String swaggerIndex(String msg) {
        return "This is swaggerIndex!" + msg;
    }

}
