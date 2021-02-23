# Java-dock

環境 : Java11

コンテナ作成

```
$ docker-compose build
```

コンテナとイメージ破棄

```
$ docker-compose down --rmi all --volumes --remove-orphans
```

コンテナ起動

```
$ docker-compose up -d
```

コンテナに入る

```
$ docker-compose exec java bash
```

コンパイル(例としてMain.javaをコンパイルする)

```
bash# javac Main.java
```

実行(例としてMain.javaを実行する)

```
bash# java Main
```

windows環境ではdockerコマンドの前にwinptyが必要かも

例: winpty docker-compose exec java bash