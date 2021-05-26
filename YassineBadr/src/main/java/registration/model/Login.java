package registration.model;

public class Login {

		private String Username;
		private String Password;

	
		

		public Login(String username, String password) {
			Username = username;
			Password = password;
		}

		public String getUsername() {
			return Username;
		}

		public void setUsername(String Username) {
			this.Username = Username;
		}

		public String getPassword() {
			return Password;
		}

		public void setPassword(String Password) {
			this.Password = Password;	
		}
}
