package com.project.ecom.payload;

import com.project.ecom.model.BrandStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BrandDTO {
    private Long brandId;
    @NotBlank
    @Size(min = 5, message = "Tên thương hiệu chứa ít nhất 5 ký tự")
    private String brandName;
    private String description;
    private String createdBy;
    private LocalDateTime createdAt;
    private String updatedBy;
    private LocalDateTime updatedAt;
    private BrandStatus status;
    private Long totalProducts;
}
