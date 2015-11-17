package com.example.ascom.tap;


public class Item {
    public String User_name ;
    public String Type;
    public String Post;
    public int icon;
    public Item(int icon, String User_name,String Type, String Post ){
        super();
        this.icon = icon;
        this.User_name = User_name;
        this.Type=Type;
        this.Post=Post;
    }



    public String getUser_name() {
        return User_name;
    }

    public String getType() {
        return Type;
    }

    public String getPost() {
        return Post;
    }

    public void setUser_name(String user_name) {
        User_name = user_name;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setPost(String post) {
        Post = post;
    }

    public int getIcon() {
        return icon;
    }
    public void setIcon(int icon) {
        this.icon = icon;
    }


}
