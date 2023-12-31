package tgobmdev.challengealuraflixapi.mockdata;

import java.time.LocalDateTime;
import java.util.UUID;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import tgobmdev.challengealuraflixapi.core.entity.VideoEntity;
import tgobmdev.challengealuraflixapi.dto.VideoDeleteResponse;
import tgobmdev.challengealuraflixapi.dto.VideoResponse;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class VideoMockData {

  public static VideoResponse getSampleVideoResponse() {
    return new VideoResponse(UUID.randomUUID(), "Video", "Description", "http://example.com/1");
  }

  public static VideoDeleteResponse getVideoDeleteResponse() {
    return new VideoDeleteResponse(UUID.randomUUID(), "Video", "Description",
        "http://example.com/1", LocalDateTime.now(), Boolean.TRUE);
  }

  public static VideoEntity getSampleVideoEntity() {
    VideoEntity videoEntity = new VideoEntity();
    videoEntity.setId(UUID.randomUUID());
    videoEntity.setTitle("Video");
    videoEntity.setDescription("Description");
    videoEntity.setUrl("http://example.com/1");
    return videoEntity;
  }
}