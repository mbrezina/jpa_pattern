package cz.burj.jpa.pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.context.ServletWebServerInitializedEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class PatternApplication {

    private static final Logger logger = LoggerFactory.getLogger(PatternApplication.class);


    public static void main(String[] args) {
		SpringApplication.run(PatternApplication.class, args);
	}


    /**
     * Posluchac udalosti nasazeni webove aplikace na Tomcat, ktery zaloguje adresu,
     * na ktere je aplikace nasazena
     * @param evt The event object
     */
    @EventListener
    public void onAppEvent(ServletWebServerInitializedEvent evt) {
        int port = evt.getApplicationContext().getWebServer().getPort();
        logger.info("Your web app address: http://localhost:" + port +
            evt.getApplicationContext().getServletContext().getContextPath());
    }
}
