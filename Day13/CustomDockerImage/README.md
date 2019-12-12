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

Happy Coding!

For further queries, please feel free to reach me jegan@tektutor.org
