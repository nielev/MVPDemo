package com.neo.mvpdemo.view;
/**
 * 更新ui总的view对象
 * @author Oray
 *
 */
public interface IUserView {
    int getID();

    String getFristName();

    String getLastName();

    void setFirstName(String firstName);

    void setLastName(String lastName);
}
