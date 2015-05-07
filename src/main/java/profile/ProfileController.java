package profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profiles")
public class ProfileController {
	
	@Autowired
	private ProfileDAO profileDAO;
	
	@RequestMapping(method = RequestMethod.POST)
	public long createProfile(@RequestBody Profile profile){
		
		return profileDAO.createProfile(profile);		
	}

}
