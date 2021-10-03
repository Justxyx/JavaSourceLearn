package test.p4反射;

/**
 * @author xm
 * @date 2021/10/3 15:31
 * @description:
 */

public class User {
    private String name = "xx";
    private Integer id = 3;


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public User() {
    }

    public User(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = result*17 + id.hashCode();
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if( ! (obj instanceof User)){
            return false;
        }

        User user = (User) obj;

//        1.
        if (this == user){
            return true;
        }

//        2.
        if(user.name.equals(this.name) && user.id.equals(this.id)){
            return true;
        }else {
            return false;
        }

    }
}

