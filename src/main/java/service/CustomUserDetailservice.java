//package service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.AuthorityUtils;
//
//import org.springframework.security.core.userdetails.UserDetails;
//
//import org.springframework.security.core.userdetails.UserDetailsService;
//
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.model.Usuario;
//import com.example.demo.repository.UsuarioRepository;
//
//@Component
//@Service
//public class CustomUserDetailservice implements UserDetailsService {
//
//	private UsuarioRepository userepository;
//
//	
//	@Autowired
//	public CustomUserDetailservice(UsuarioRepository usuarioRepository) {
//	this.userepository = usuarioRepository;	
//	}
//	
//	@Bean
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		
//		Usuario user = Optional.ofNullable(userepository.findByUserName(username))
//				.orElseThrow(()-> new UsernameNotFoundException("user not found"));
//		List<GrantedAuthority> authourityListAdmin = AuthorityUtils.createAuthorityList("ROLE_USER","ROLE_ADMIN");
//		List<GrantedAuthority> authourityListUser = AuthorityUtils.createAuthorityList("ROLE_USER","ROLE_ADMIN");
//		
//		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), user.isAdmin()?authourityListAdmin:authourityListUser);
//		
//		
//		
//			
//	}
//
//	
//}
