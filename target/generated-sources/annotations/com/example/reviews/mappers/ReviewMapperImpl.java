package com.example.reviews.mappers;

import com.example.reviews.entities.ProductEntity;
import com.example.reviews.entities.ReviewEntity;
import com.example.reviews.entities.UserEntity;
import com.example.reviews.models.ProductModel;
import com.example.reviews.models.ReviewModel;
import com.example.reviews.models.UserModel;
import java.util.Arrays;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-12T18:55:14+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230814-2020, environment: Java 17.0.8.1 (Eclipse Adoptium)"
)
@Component
public class ReviewMapperImpl implements ReviewMapper {

    @Override
    public ReviewEntity toEntity(ReviewModel review) {
        if ( review == null ) {
            return null;
        }

        ReviewEntity.ReviewEntityBuilder reviewEntity = ReviewEntity.builder();

        reviewEntity.id( review.getId() );
        reviewEntity.product( productModelToProductEntity( review.getProduct() ) );
        reviewEntity.review( review.getReview() );
        reviewEntity.userReviewing( userModelToUserEntity( review.getUserReviewing() ) );

        return reviewEntity.build();
    }

    @Override
    public ReviewModel toModel(ReviewEntity review) {
        if ( review == null ) {
            return null;
        }

        ReviewModel.ReviewModelBuilder reviewModel = ReviewModel.builder();

        reviewModel.id( review.getId() );
        reviewModel.product( productEntityToProductModel( review.getProduct() ) );
        reviewModel.review( review.getReview() );
        reviewModel.userReviewing( userEntityToUserModel( review.getUserReviewing() ) );

        return reviewModel.build();
    }

    protected ProductEntity productModelToProductEntity(ProductModel productModel) {
        if ( productModel == null ) {
            return null;
        }

        ProductEntity.ProductEntityBuilder productEntity = ProductEntity.builder();

        productEntity.id( productModel.getId() );
        productEntity.initialReview( productModel.getInitialReview() );
        productEntity.owner( productModel.getOwner() );
        byte[] product = productModel.getProduct();
        if ( product != null ) {
            productEntity.product( Arrays.copyOf( product, product.length ) );
        }

        return productEntity.build();
    }

    protected UserEntity userModelToUserEntity(UserModel userModel) {
        if ( userModel == null ) {
            return null;
        }

        UserEntity.UserEntityBuilder userEntity = UserEntity.builder();

        byte[] avatar = userModel.getAvatar();
        if ( avatar != null ) {
            userEntity.avatar( Arrays.copyOf( avatar, avatar.length ) );
        }
        userEntity.id( userModel.getId() );
        userEntity.lastLogin( userModel.getLastLogin() );
        userEntity.password( userModel.getPassword() );
        userEntity.username( userModel.getUsername() );

        return userEntity.build();
    }

    protected ProductModel productEntityToProductModel(ProductEntity productEntity) {
        if ( productEntity == null ) {
            return null;
        }

        ProductModel.ProductModelBuilder productModel = ProductModel.builder();

        productModel.id( productEntity.getId() );
        productModel.initialReview( productEntity.getInitialReview() );
        productModel.owner( productEntity.getOwner() );
        byte[] product = productEntity.getProduct();
        if ( product != null ) {
            productModel.product( Arrays.copyOf( product, product.length ) );
        }

        return productModel.build();
    }

    protected UserModel userEntityToUserModel(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserModel.UserModelBuilder userModel = UserModel.builder();

        byte[] avatar = userEntity.getAvatar();
        if ( avatar != null ) {
            userModel.avatar( Arrays.copyOf( avatar, avatar.length ) );
        }
        userModel.id( userEntity.getId() );
        userModel.lastLogin( userEntity.getLastLogin() );
        userModel.password( userEntity.getPassword() );
        userModel.username( userEntity.getUsername() );

        return userModel.build();
    }
}
