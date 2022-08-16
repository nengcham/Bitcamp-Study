package kr.co.eis.auth.domains;

import lombok.Builder;
import lombok.Getter;

/**
 * packageName: kr.co.eis.security.domains
 * fileName   : Messenger
 * author     : ChoiGeonIl
 * date       : 2022-05-23
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-23    ChoiGeonIl     최초 생성
 */
@Getter @Builder
public class Messenger {
    private String message, code, token;
    private int status;
}
