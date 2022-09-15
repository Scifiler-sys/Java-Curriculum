from nginx:alpine

copy /build /usr/share/nginx/html

RUN rm /etc/nginx/conf.d/default.conf
# replace with custom one
COPY nginx/nginx.conf /etc/nginx/conf.d

expose 80

cmd ["nginx", "-g", "daemon off;"]