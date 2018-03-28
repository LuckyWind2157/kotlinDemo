package com.vcredit.sms.config

import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

/**
 * restTemplate 的配置类
 */
@Configuration
class RestTemplateConfig(val builder: RestTemplateBuilder) {

    @Bean
    fun restTemplate(): RestTemplate {
        return builder.build()
    }


}