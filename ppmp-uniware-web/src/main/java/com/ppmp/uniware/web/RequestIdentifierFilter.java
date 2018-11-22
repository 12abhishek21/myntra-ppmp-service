package com.ppmp.uniware.web;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import com.ppmp.uniware.base.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.AuthorizationServiceException;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ankurpratik on 21/11/18.
 */
// TODO: 21/11/18 add filter to get merchantId and other details from request.
//@Component
//@Order(1)
public class RequestIdentifierFilter implements Filter {
    private static Logger       LOG         = LoggerFactory.getLogger(RequestIdentifierFilter.class);
    private static final String MERCHANT_ID = "merchantId";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        if (!RequestMethod.OPTIONS.name().equals(req.getMethod())) {
            if (req.getHeader(MERCHANT_ID) != null) {
                RequestContext.current().setMerchantId(req.getHeader(MERCHANT_ID));
            } else {
                throw new AuthorizationServiceException("Missing required merchant id");
            }
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
