package configclient.configclient;

/**
 * @author Administrator
 * @create 2019-04-27
 * @since 1.0.0
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;


public abstract class RemoteConfig {

   @Value("${server.port}")
    public String profileEnv;
}
