FROM ubuntu:18.04
# This is the Dockerfile syntax to select a base image
# We wll be using the Ubuntu 18.04 base image and extending it from here

# From our base image, we will need to download our libraries, specifically snake
# We will use the RUN syntax to tell the container to run whatever commands we want
RUN apt-get update && apt-get install -y libncurses5-dev && apt-get install -y nsnake

# The final step is to tell the Dockerfile what command to run to start/begin the container

CMD ["/usr/games/nsnake"]

# There are many more commands/syntax to learn in regards to Dockerfiles
# Some common commands
# ENTRYPOINT, which is very similar to CMD
# COPY, which allows you to copy files from the source computer to inside the container
# ADD, which is similar to COPY, except you can designate files from the internet to be downloaded into the container
# EXPOSE, will expose certain ports to be available over HTTP
# Technically, EXPOSE is not actually needed, but it is helpful for documentation purposes
# For example, when you share your image, others will be able to read which ports you have explicitly exposed