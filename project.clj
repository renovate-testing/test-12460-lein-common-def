(def grpc-version "1.41.0")

(defproject renovate-common-version "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [io.grpc/grpc-netty-shaded ~grpc-version]
                 [io.grpc/grpc-protobuf ~grpc-version]
                 [io.grpc/grpc-services ~grpc-version]]
  :main ^:skip-aot renovate-common-version.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot      :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
