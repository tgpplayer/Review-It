package com.example.reviews.mappers;

import com.example.reviews.entities.UserEntity;
import com.example.reviews.models.UserModel;
import java.util.Arrays;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-08T21:42:38+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230814-2020, environment: Java 17.0.8.1 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserModel toModel(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserModel.UserModelBuilder userModel = UserModel.builder();

        byte[] avatar = userEntity.getAvatar();
        if ( avatar != null ) {
            userModel.avatar( Arrays.copyOf( avatar, avatar.length ) );
        }
        userModel.id( userEntity.getId() );
        userModel.username( userEntity.getUsername() );

        return userModel.build();
    }

    @Override
    public UserEntity toEntity(UserModel userModel) {
        if ( userModel == null ) {
            return null;
        }

        UserEntity.UserEntityBuilder userEntity = UserEntity.builder();

        byte[] avatar = userModel.getAvatar();
        if ( avatar != null ) {
            userEntity.avatar( Arrays.copyOf( avatar, avatar.length ) );
        }
        userEntity.id( userModel.getId() );
        userEntity.username( userModel.getUsername() );

        return userEntity.build();
    }
}
