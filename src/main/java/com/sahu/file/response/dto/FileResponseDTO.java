package com.sahu.file.response.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FileResponseDTO {
	private String fileName;
    private String fileDownloadUri;
    private String fileType;
    private long size;
}
