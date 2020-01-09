package cn.leon.gateway.model;

import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @ClassName GatewayPredicateDefinition
 * @Description
 * @Author Jevon
 * @Date2020/1/9 12:44
 **/
@Data
public class GatewayPredicateDefinition {
    /**
     * 断言对应的Name
     */
    private String name;
    /**
     * 配置的断言规则
     */
    private Map<String, String> args = new LinkedHashMap();
}
