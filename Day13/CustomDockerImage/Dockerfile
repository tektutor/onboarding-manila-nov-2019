#Here we are using ubuntu:16.04 as the Base image, you may choose any other image as base image as per 
#your project requirement
FROM ubuntu:16.04

#It's a good practice to document the author details, so end-user's can approach you in case they
#found any bug or if they are looking for some new features in your custom docker image.
MAINTAINER Jeganathan Swaminathan <jegan@tektutor.org>

#This will install SSH Server
RUN apt-get update && apt-get install -y openssh-server  

#SSH Server requires this folder, hence we need to create this folder before the SSH server is started
RUN mkdir -p /var/run/sshd

#This will change the root user's password to 'root'
RUN echo 'root:root' | chpasswd

#This allows root user to login via ssh, by default Linux doesn't allow root user to login via ssh
RUN sed -i 's/PermitRootLogin prohibit-password/PermitRootLogin yes/' /etc/ssh/sshd_config

#This allows key based login authentication ( Public/Private RSA Key Pair )
RUN mkdir -p /root/.ssh
COPY authorized_keys /root/.ssh/authorized_keys

#SSH Server uses port 22 by default, hence we are documenting the port 22 is kept open in this image
EXPOSE 22

#This configures ssh server to start as a Daemon from containers created out of this Docker image.
CMD ["/usr/sbin/sshd", "-D"]
