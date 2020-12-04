Docker is a virtualization technology. Virtualization is the idea of simulating hardware/software. We are running a fake computer inside our computer.

Previously the industry used technologies such as VirtualBox or VMWare to simulate _entire_ computers, Operating System and all via virtualization. However, this included many libraries/dependencies that are not ultimately needed.

These virtual machines are created via blueprints called "images". And for these large virtual machines, the images were also very large (multiple Gigabytes). Very difficult to share.

Over time, industry wanted to remove the unneeded contents and make this virtualization "lightweight". That is what docker does. We are effectively creating very minimal virtual machines. Generally speaking, they do not have an entire operating system. They generally don't have the libraries needed to use GUI based software. But this is usually all we need to run most applications.

The ultimate goal of virtualization is for the industry to run many copies of their applications across the world, and have each copy run the _exact_ same way. Virtualization solves this problem by simulating the same fake computer on every real world computer. We know they are identical because they were produced from the same image.

These lightweight virtual machines are referred to as "containers". Because these container images are so much smaller, it also becomes much more feasible to share them with others.

This has opened the door to repositories like DockerHub, which allow us to upload/download images very easily. The docker software supports "pushing/pulling" images from these repositories.

We will be creating our own images, and our own containers from these images. We will construct these images from what is called a "Dockerfile". This is special syntax that defines instructions to produce these blueprints or "images". Referred to as "Dockerfile syntax".

From the Dockerfile, we then use the "docker build" command to build/produce an image from the Dockerfile instructions.

Once we have the image, we can use it to produce containers (the actively running small-scale virtual machines), or we can upload the image to a repository like DockerHub so that others can also use it.

For our snake demo, we ran the following commands:

docker build -t snake:latest .

docker run -it snake:latest

You can also use other commands:

docker images


If you wanted to be able to push your image to Dockerhub, you first need to make your account and login.
You can login either with Docker Desktop or with the "docker login" command.

Once logged in, you need to retag your image with your username as a prefix.

docker tag snake:latest <your-docker-username>/snake:latest

docker push <your-docker-username>/snake:latest

Then others will be able to download it with

docker pull <your-docker-username>/snake:latest

To summarize, docker does 3 things:

Create images

Share images

Produce containers from the images