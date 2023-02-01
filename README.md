# Docker

## How can we run this project on Docker?
- Build your own image with Dockerfile
- Push your own image to Docker Hub
- Pull and start/run a container
---
#### 1, Build image:
- docker build --tag springboot-docker .
##### To create a new tag for the image we have build above
- docker tag springboot-docker:latest springboot-docker:v.1.0.0
##### Login to your Docker Hub Account, create a repository
- docker tag springboot-docker:v1.0.0 manh2009/springboot-docker:v1.0.0

#### 2, Push to Docker Hub:
- docker push manh2009/springboot-docker:v1.0.0

#### 3, Pull and start/run a container
- docker run -dp 8085:8083 \
--name springboot-docker-container \
-v "$(pwd):/app" \
manh2009/springboot-docker:v1.0.0

#### Test springboot app: Browser, Postman

#### Update code & run:
docker restart springboot-docker-container

---
##### Check container:
- docker ps -a
##### Check image:
- docker images
##### Delete images by id:
- docker rmi -f idImages/name
##### Build Docker Compose file:
- docker-compose -f docker-compose.dev.yml up --build
---
##### Access mysql cmd inside mysql-springboot-container:
- docker exec -ti mysql-springboot-container mysql -u root - p

