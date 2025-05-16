package jpa_auditing;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

@Component("auditorProvider")
public class AuditorAwareImpl  implements AuditorAware<String>{
	
	public Optional<String> getCurrentAuditor(){
		return Optional.of("system_user");
	}
	

}
