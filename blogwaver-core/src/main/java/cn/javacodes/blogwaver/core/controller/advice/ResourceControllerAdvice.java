package cn.javacodes.blogwaver.core.controller.advice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.resource.ResourceUrlProvider;


/**
 * blogwaver
 * cn.javacodes.blogwaver.base.controller
 *
 * @author huzhanfei
 * @version 1.0
 * @since 2018/1/14
 */
@ControllerAdvice
public class ResourceControllerAdvice {

    @Autowired
    private ResourceUrlProvider resourceUrlProvider;

    @ModelAttribute("urls")
    public ResourceUrlProvider urls() {
        return this.resourceUrlProvider;
    }

}
