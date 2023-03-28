package br.es.tj.eprocees.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import br.es.tj.eprocees.model.DadosUsuarioLogado;

@Component
public class Interceptor implements HandlerInterceptor {
        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
                        throws Exception {
                DadosUsuarioLogado.nomeUsuarioLogado = "WILLY DE ALMEIDA RODRIGUES SALGADO";
                DadosUsuarioLogado.cpfUsuarioLogado = "00464792100";
                return true;
        }

        @Override
        public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                        @Nullable ModelAndView modelAndView) throws Exception {

        }

        @Override
        public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                        @Nullable Exception ex) throws Exception {
        }

}