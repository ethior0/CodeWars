function domainName(url){
  const newUrl = url.replace("http://", "").replace("https://", "").replace("www.", "");
  return newUrl.split(".")[0];
}

console.log(domainName("https://youtube.com"));