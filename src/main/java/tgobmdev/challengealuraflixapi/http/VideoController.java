package tgobmdev.challengealuraflixapi.http;

import java.util.List;
import java.util.UUID;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tgobmdev.challengealuraflixapi.dto.VideoResponse;
import tgobmdev.challengealuraflixapi.service.VideoService;

@RestController
@RequestMapping(value = "videos")
public class VideoController {

  private final VideoService videoService;

  public VideoController(VideoService videoService) {
    this.videoService = videoService;
  }

  @GetMapping
  public ResponseEntity<List<VideoResponse>> findAllVideos() {
    return ResponseEntity.ok(videoService.findAllVideos());
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<VideoResponse> findVideoById(@PathVariable UUID id) {
    return ResponseEntity.ok(videoService.findVideoById(id));
  }
}