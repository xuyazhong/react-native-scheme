
Pod::Spec.new do |s|
  s.name         = "RNScheme"
  s.version      = "1.0.0"
  s.summary      = "RNScheme"
  s.description  = <<-DESC
                  RNScheme
                   DESC
  s.homepage     = "https://github.com/xuyazhong/react-native-scheme"
  s.license      = "MIT"
  s.author             = { "xuyazhong" => "xuyazhong@foxmail.com" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/xuyazhong/react-native-scheme.git", :tag => "main" }
  s.source_files  = "RNScheme/**/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"
  #s.dependency "others"

end

  