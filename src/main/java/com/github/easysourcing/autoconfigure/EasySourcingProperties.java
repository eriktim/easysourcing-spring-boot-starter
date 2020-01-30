package com.github.easysourcing.autoconfigure;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "easysourcing")
public class EasySourcingProperties {
  private String applicationId;
  private String bootstrapServers;
  private int partitions = 1;
  private int replicas = 1;
  private String securityProtocol = "PLAINTEXT";
}
