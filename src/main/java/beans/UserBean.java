package beans;

/* //创建数据库
    CREATE TABLE `t_user` (
        `id` int(11) NOT NULL AUTO_INCREMENT,
        `username` varchar(20) DEFAULT NULL,
        `password` varchar(20) DEFAULT NULL,
        `account` double(10,2) DEFAULT NULL,
        PRIMARY KEY (`id`)
        ) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
        */


public class UserBean {
    private int id;
    private String username;
    private String password;
    private double account;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    public UserBean(){

    }
    public UserBean(String user,String pass,double account){
        this.username = user;
        this.password = pass;
        this.account = account;
    }

    public UserBean(int id,String user,String pass,double account){
        this.id = id;
        this.username = user;
        this.password = pass;
        this.account = account;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", account=" + account +
                '}';
    }
}
