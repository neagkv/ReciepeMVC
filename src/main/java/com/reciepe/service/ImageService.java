package com.reciepe.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author Kevin Neag
 */
public interface ImageService {


        void saveImageFile(Long recipeId, MultipartFile file);

}
