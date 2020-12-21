<%-- Created by IntelliJ IDEA. User: ToanNC7 Date: 12/21/2020 Time: 17:10 To
change this template use File | Settings | File Templates. --%>
<%@ include file="/common/taglib.jsp" %>
<div class="central-meta postbox">
  <span class="create-post">Create post</span>
  <div class="new-postbox">
    <figure>
      <img src="${pageContext.request.contextPath}/template/client/images/resources/admin.jpg" alt="" />
    </figure>
    <div class="newpst-input">
      <form method="post">
        <textarea
          rows="2"
          placeholder="Share some what you are thinking?"></textarea>
      </form>
    </div>
    <div class="attachments">
      <ul>
        <li>
          <span class="add-loc">
            <i class="fa fa-map-marker"></i>
          </span>
        </li>
        <li>
          <i class="fa fa-music"></i>
          <label class="fileContainer">
            <input type="file" />
          </label>
        </li>
        <li>
          <i class="fa fa-image"></i>
          <label class="fileContainer">
            <input type="file" />
          </label>
        </li>
        <li>
          <i class="fa fa-video-camera"></i>
          <label class="fileContainer">
            <input type="file" />
          </label>
        </li>
        <li>
          <i class="fa fa-camera"></i>
          <label class="fileContainer">
            <input type="file" />
          </label>
        </li>
        <li class="preview-btn">
          <button class="post-btn-preview" type="submit" data-ripple="">
            Preview
          </button>
        </li>
      </ul>
      <button class="post-btn" type="submit" data-ripple="">Post</button>
    </div>
    <div class="add-location-post">
      <span>Drag map point to selected area</span>
      <div class="row">
        <div class="col-lg-6">
          <label class="control-label">Lat :</label>
          <input type="text" class="" id="us3-lat" />
        </div>
        <div class="col-lg-6">
          <label>Long :</label>
          <input type="text" class="" id="us3-lon" />
        </div>
      </div>
      <!-- map -->
      <div id="us3"></div>
    </div>
  </div>
</div>
<!-- add post new box -->
<div class="central-meta">
  <span class="create-post">Recent Stories <a href="#" title="">See All</a></span>
  <div class="story-postbox">
    <div class="row">
      <div class="col-lg-3 col-md-3 col-sm-3">
        <div class="story-box">
          <figure>
            <img src="${pageContext.request.contextPath}/template/client/images/resources/story-1.jpg" alt="" />
            <span>Add Your Story</span>
          </figure>
          <div class="story-thumb" data-toggle="tooltip" title="Add Your Story">
            <i class="fa fa-plus"></i>
          </div>
        </div>
      </div>
      <div class="col-lg-3 col-md-3 col-sm-3">
        <div class="story-box">
          <figure>
            <img src="${pageContext.request.contextPath}/template/client/images/resources/story-2.jpg" alt="" />
            <span>Adam James</span>
          </figure>
          <div class="story-thumb" data-toggle="tooltip" title="Adam James">
            <img src="${pageContext.request.contextPath}/template/client/images/resources/thumb-2.jpg" alt="" />
          </div>
        </div>
      </div>
      <div class="col-lg-3 col-md-3 col-sm-3">
        <div class="story-box">
          <figure>
            <img src="${pageContext.request.contextPath}/template/client/images/resources/story-3.jpg" alt="" />
            <span>Emily grey</span>
          </figure>
          <div class="story-thumb" data-toggle="tooltip" title="Emily grey">
            <img src="${pageContext.request.contextPath}/template/client/images/resources/thumb-3.jpg" alt="" />
          </div>
        </div>
      </div>
      <div class="col-lg-3 col-md-3 col-sm-3">
        <div class="story-box">
          <figure>
            <img src="${pageContext.request.contextPath}/template/client/images/resources/story-4.jpg" alt="" />
            <span>Jhon Deo</span>
          </figure>
          <div class="story-thumb" data-toggle="tooltip" title="Jhon Deo">
            <img src="${pageContext.request.contextPath}/template/client/images/resources/thumb-4.jpg" alt="" />
          </div>
        </div>
      </div>
    </div>
    <div class="stories-wraper">
      <div class="status-story">
        <span class="close-story"><i class="ti-close"></i></span>
        <div class="row">
          <div class="col-lg-4">
            <div class="stories-users">
              <h5>Stories</h5>
              <div class="my-status">
                <figure>
                  <img src="${pageContext.request.contextPath}/template/client/images/resources/friend-avatar10.jpg" alt="" />
                </figure>
                <a href="#" title="" class="main-btn">Add New</a>
                <div class="story-user">
                  <span>My Story</span>
                  <ins>No updates</ins>
                </div>
              </div>
              <ul class="frnds-stories">
                <li>
                  <figure>
                    <img src="${pageContext.request.contextPath}/template/client/images/resources/friend-avatar11.jpg" alt="" />
                  </figure>
                  <div class="story-user">
                    <span>Emily doll</span>
                    <ins>yesterday</ins>
                  </div>
                </li>
                <li>
                  <figure>
                    <img src="${pageContext.request.contextPath}/template/client/images/resources/friend-avatar15.jpg" alt="" />
                  </figure>
                  <div class="story-user">
                    <span>Jhon Borny</span>
                    <ins>3 days ago</ins>
                  </div>
                </li>
                <li>
                  <figure>
                    <img src="${pageContext.request.contextPath}/template/client/images/resources/friend-avatar12.jpg" alt="" />
                  </figure>
                  <div class="story-user">
                    <span>Sarah Khan</span>
                    <ins>2 days ago</ins>
                  </div>
                </li>
                <li>
                  <figure>
                    <img src="${pageContext.request.contextPath}/template/client/images/resources/friend-avatar13.jpg" alt="" />
                  </figure>
                  <div class="story-user">
                    <span>Zara Hayat</span>
                    <ins>1 day ago</ins>
                  </div>
                </li>
                <li>
                  <figure>
                    <img src="${pageContext.request.contextPath}/template/client/images/resources/friend-avatar14.jpg" alt="" />
                  </figure>
                  <div class="story-user">
                    <span>Zing Jang</span>
                    <ins>2 days ago</ins>
                  </div>
                </li>

                <li>
                  <figure>
                    <img src="${pageContext.request.contextPath}/template/client/images/resources/friend-avatar16.jpg" alt="" />
                  </figure>
                  <div class="story-user">
                    <span>Emma watson</span>
                    <ins>jan,12 2020</ins>
                  </div>
                </li>
              </ul>
            </div>
          </div>
          <div class="col-lg-8">
            <div id="btns-wrapper"></div>
            <div id="slideshow">
              <img
                class="slide"
                src="https://placehold.it/856x380/FF6347/FFFFFF&amp;text=1"
                alt="11"/>
              <img
                class="slide"
                src="https://placehold.it/856x380/6FC6F7/FFFFFF&amp;text=2"
                alt="2"/>
              <img
                class="slide"
                src="https://placehold.it/856x380/f3e686/FFFFFF&amp;text=3"
                alt="3"/>
              <img
                class="slide"
                src="https://placehold.it/856x380/71eea3/FFFFFF&amp;text=4"
                alt="4"/>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<!-- top stories -->

