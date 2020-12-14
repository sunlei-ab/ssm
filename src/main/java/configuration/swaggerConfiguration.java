package configuration;


import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
//@EnableSwagger2
@EnableOpenApi
public class swaggerConfiguration {


    /**
     *
     * @return
     */

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * Api文档详细信息
     * @return ApiInfo
     */
    public ApiInfo apiInfo()
    {
        return new ApiInfoBuilder()
                .title("项目API文档")
                .contact(new Contact("sun","http://www.javakc.com","994232233@qq.com"))
                .version("1.1")
                .description("本文档为后台接口API说明")
                .build();
    }

























//    /**
//     * 创建swagger docket实例
//     * @return
//     */
//
//    @Bean
//    public Docket createRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.javakc.springbootssm"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    /**
//     * Api文档详细信息
//     * @return ApiInfo
//     */
//    public ApiInfo apiInfo()
//    {
//        return new ApiInfoBuilder()
//                .title("springboot 利用 swagger2 构建 api 文档")
//                .description("简单优雅的 restfun 风格")
//                .termsOfServiceUrl("http://www.javakc.com")
//                .version("1.0")
//                .build();
//    }



}
