(defproject lein-java-netty-websocket-example "0.1.0-SNAPSHOT"
  :description "Netty Example Websocket Server"
  :url "https://github.com/netty/netty/tree/4.0/example/src/main/java/io/netty/example/http/websocketx/server"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[io.netty/netty-all "4.0.24.Final"]]
  :java-source-paths ["src/java"]
  :javac-options ["-target" "1.8" "-source" "1.8"]

  :main lein_java_netty_websocket_example.WebSocketServer
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :repositories {"sonatype" "https://oss.sonatype.org/content/repositories/releases"
                 "sonatype-snapshots" "https://oss.sonatype.org/content/repositories/snapshots"})
