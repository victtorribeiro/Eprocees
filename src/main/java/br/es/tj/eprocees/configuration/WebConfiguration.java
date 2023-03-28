package br.es.tj.eprocees.configuration;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import br.es.tj.eprocees.interceptor.Interceptor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class WebConfiguration implements WebMvcConfigurer {

    private final Interceptor interceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor);
    }
}
