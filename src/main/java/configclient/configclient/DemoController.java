package configclient.configclient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

    @RestController
    @RequestMapping("/demo")
    public class DemoController extends RemoteConfig {
        @RequestMapping("/config/byval")
        public Object getRemoteConfigByValue(){
            Map<String,Object> model=new HashMap<>();
            model.put("getMode","@Value");

            Map<String,String> remoteCgfMap=new HashMap<>();
            remoteCgfMap.put("profileEnv", this.profileEnv);
            model.put("remoteConfig",remoteCgfMap);
            return model;
        }
    }
