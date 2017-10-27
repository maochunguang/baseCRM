package com.koowo.cache;

import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.JedisCluster;

/**
 * @author maocg
 * @date 2017/10/27
 */
public class RedisCluster implements RedisUtil {
    @Autowired
    private JedisCluster jedisCluster;

    @Override
    public void set(String key, String value) {
        this.jedisCluster.set(key, value);
    }

    @Override
    public void set(String key, String value, Integer seconds) {
        this.jedisCluster.set(key, value);
        this.jedisCluster.expire(key, seconds);
    }

    @Override
    public String get(String key) {
        return this.jedisCluster.get(key);
    }

    @Override
    public void del(String key) {
        this.jedisCluster.del(key);
    }

    @Override
    public void expire(String key, Integer seconds) {
        this.jedisCluster.expire(key, seconds);
    }

    @Override
    public Long incr(String key) {
        return this.jedisCluster.incr(key);
    }

    /**
     * 获取JedisCluster对象<br/>
     * 可以直接使用它来进行redis操作
     *
     * @return JedisCluster对象
     */
    public JedisCluster getJedisCluster() {
        return jedisCluster;
    }
}