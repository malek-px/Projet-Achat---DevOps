package tn.esprit.rh.achat.services;

import java.util.List;

import tn.esprit.rh.achat.entities.User;


public interface IUserService {

List<User> retrieveAllUsers();
User addUser(User u);
void deleteUser(String id);
User updateUser(User u);
User retrieveUser(String id);

}
