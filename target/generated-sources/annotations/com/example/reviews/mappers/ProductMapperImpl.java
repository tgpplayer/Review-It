package com.example.reviews.mappers;

import com.example.reviews.entities.ProductEntity;
import com.example.reviews.models.ProductModel;
import java.util.Arrays;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-12T18:54:21+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8.1 (Eclipse Adoptium)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductEntity toEntity(ProductModel product) {
        if ( product == null ) {
            return null;
        }

        ProductEntity.ProductEntityBuilder productEntity = ProductEntity.builder();

        productEntity.id( product.getId() );
        productEntity.owner( product.getOwner() );
        byte[] product1 = product.getProduct();
        if ( product1 != null ) {
            productEntity.product( Arrays.copyOf( product1, product1.length ) );
        }
        productEntity.initialReview( product.getInitialReview() );

        return productEntity.build();
    }

    @Override
    public ProductModel toModel(ProductEntity product) {
        if ( product == null ) {
            return null;
        }

        ProductModel.ProductModelBuilder productModel = ProductModel.builder();

        productModel.id( product.getId() );
        productModel.owner( product.getOwner() );
        byte[] product1 = product.getProduct();
        if ( product1 != null ) {
            productModel.product( Arrays.copyOf( product1, product1.length ) );
        }
        productModel.initialReview( product.getInitialReview() );

        return productModel.build();
    }
}
