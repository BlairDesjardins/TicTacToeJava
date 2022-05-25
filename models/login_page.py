class LoginPage:

    def __init__(self, username, password):
        self.username = username
        self.password = password

    def __repr__(self):
        return str(
            {
                "Username" : self.username,
                "Password" : self.password
            }
        )

    def json(self):
        return {
            "Username" : self.username,
            "Password" : self.password
        }