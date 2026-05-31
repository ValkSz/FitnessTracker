package pl.wsb.fitnesstracker.user.internal;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.wsb.fitnesstracker.user.api.*;

import java.util.List;

/**
 * UserController is responsible for handling HTTP requests related to user operations.
 * It provides endpoints for retrieving and creating users.
 */
@RestController
@RequestMapping("/v1/users")
class UserController {

    private final UserServiceImpl userService;

    private final UserMapper userMapper;

    private final UserProvider userProvider;

    UserController(UserServiceImpl userService, UserMapper userMapper, UserProvider userProvider) {
        this.userService = userService;
        this.userMapper = userMapper;
        this.userProvider = userProvider;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto addUser(@RequestBody UserDto userDto) throws InterruptedException {

        User created = userService.createUser(userMapper.toUser(userDto));
        return userMapper.toUserDto(created);
    }

    @GetMapping
    public List<UserDto> getAllUsers(){
        return userService.findAllUsers().stream().map(userMapper::toUserDto).toList();
    }

    @GetMapping("/simple")
    public List<UserSimpleDto> getAllSimpleUsers(){
        return userService.findAllUsers().stream().map(userMapper::toUserSimpleDto).toList();
    }

    @GetMapping("/{id}")
    public UserDto getUser(@PathVariable Long id) {
        return userService.getUser(id).map(userMapper::toUserDto).orElseThrow(() -> new UserNotFoundException(id));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

}