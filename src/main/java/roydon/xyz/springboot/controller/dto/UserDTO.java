package roydon.xyz.springboot.controller.dto;

import lombok.Data;
import roydon.xyz.springboot.entity.Menu;

import java.util.List;

/**
 * Created by Intellij IDEA
 * Author: yi cheng
 * Date: 2022/9/15
 * Time: 20:19
 **/
@Data
public class UserDTO {
    private String username;
    private String password;
    private String nickname;
    private String avatarUrl;
    private String token;
    private String role;
    private List<Menu> menus;
}
