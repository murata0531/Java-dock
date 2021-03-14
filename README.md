# Java-dock

環境 : Java SE11

Environment : Java SE11

OCJP Gold SE8 to SE11アップグレード試験勉強用

Oracle Certified Java Programmer Ⅱ for upgrede exam

2021年3月現在の最新はJava SE15

The latest as of March 2021 is Java SE15

_____________________________________
コンテナ作成

Creating a container

```
$ docker-compose build
```

コンテナとイメージ破棄

Discard containers and images

```
$ docker-compose down --rmi all --volumes --remove-orphans
```

コンテナ起動

Start the container

```
$ docker-compose up -d
```

コンテナに入る

Enter the container

```
$ docker-compose exec java bash
```

コンパイル(例としてMain.javaをコンパイルする)

Compile(example : Main.java)

```
bash# javac Main.java
```

実行(例としてMain.javaを実行する)

Run(example : Main.java)

```
bash# java Main
```

windows環境ではdockerコマンドの前に「winpty」が必要かも

"Winpty" may be required before docker command　in windows environment

example : 

```
$ winpty docker-compose exec java bash
```