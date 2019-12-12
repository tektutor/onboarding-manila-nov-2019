In order to build this custom docker image, you must first install Docker in your Operating System. In case you have not installed Docker already, you may check the detailed installation instructions at the below URL

https://docs.docker.com/install/

To enable key based login access, you need to create a Public/Private RSA key pair as shown below
ssh-keygen

Once you have created the key pairs, make sure the public key generated is copied as authorized_keys

cd CustomDockerImage

cp /root/.ssh/id_rsa.pub authorized_keys

You may build this custom docker image with the below command
docker buid -t tetutor/ssh-server .

At this stage, you are expected to see your customer docker images with the below command

docker images

You may create docker container using the below command

docker run -d --name ssh_server1 --hostname ssh_server1 -p 2001:22 tektutor/ssh-server

You may now verify if the ssh_server1 container is running using the below command
docker ps

Assuming, the ssh_server1 is running, you may attempt to perform a ssh login to the ssh_server1 container as below
ssh -p 2001 root@localhost

[root@tektutor ~]# docker images
REPOSITORY                                TAG                 IMAGE ID            CREATED             SIZE
tektutor/ssh-server                       latest              01d12e968a81        37 minutes ago      203 MB
<none>                                    <none>              3297215d17dc        42 minutes ago      203 MB
<none>                                    <none>              0b520b548258        44 minutes ago      203 MB
<none>                                    <none>              485dd423ce32        46 minutes ago      203 MB
<none>                                    <none>              146b227d4d2a        48 minutes ago      203 MB
tektutorjegan/calculator-ms               2.0                 b9b287b26bf4        47 hours ago        508 MB
tektutor/calculator-ms                    2.0                 b9b287b26bf4        47 hours ago        508 MB
tektutor/calculator-ms                    latest              cad16544143f        2 days ago          462 MB
tektutorjegan/calculator-ms               latest              cad16544143f        2 days ago          462 MB
docker.io/ubuntu                          16.04               56bab49eef2e        2 weeks ago         123 MB
docker.io/mysql                           5.6                 e143ed325782        2 weeks ago         302 MB
docker.io/nginx                           latest              231d40e811cd        2 weeks ago         126 MB
docker.io/openjdk                         latest              e9ee535ba1b1        3 weeks ago         491 MB
docker.io/ubuntu                          latest              775349758637        5 weeks ago         64.2 MB
docker.io/mirantis/kubeadm-dind-cluster   <none>              e56b212db843        4 months ago        1.26 GB
docker.io/mirantis/kubeadm-dind-cluster   <none>              91a714913f28        4 months ago        1.32 GB
[root@tektutor ~]# docker ps
CONTAINER ID        IMAGE                 COMMAND               CREATED             STATUS              PORTS                  NAMES
7e6c68535fc4        tektutor/ssh-server   "/usr/sbin/sshd -D"   37 minutes ago      Up 37 minutes       0.0.0.0:2001->22/tcp   ssh_server1
[root@tektutor ~]# ssh -p 2001 root@localhost
Welcome to Ubuntu 16.04.6 LTS (GNU/Linux 3.10.0-693.el7.x86_64 x86_64)

 * Documentation:  https://help.ubuntu.com
 * Management:     https://landscape.canonical.com
 * Support:        https://ubuntu.com/advantage

Last login: Thu Dec 12 06:01:00 2019 from 172.17.0.1
root@ssh_server1:~# 


Happy Coding!

For further queries, please feel free to reach me jegan@tektutor.org
