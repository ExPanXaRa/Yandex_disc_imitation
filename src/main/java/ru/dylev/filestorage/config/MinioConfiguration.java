package ru.dylev.filestorage.config;

import io.minio.MinioClient;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.dylev.filestorage.config.properties.MinioProperties;

/**
 * Configuration for Minio.
 *
 * @see MinioProperties
 * @see ru.dylev.filestorage.config.handlers.MinioBucketHandler
 */
@Configuration
@RequiredArgsConstructor
public class MinioConfiguration {

    private final MinioProperties minioProperties;

    @Bean
    public MinioClient minioClient() {
        return MinioClient.builder()
                .endpoint(minioProperties.getUrl())
                .credentials(minioProperties.getUser(), minioProperties.getPassword())
                .build();
    }
}
